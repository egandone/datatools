package ca.egandone.datatools;

import java.util.Collection;
import java.util.Map;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;
 
public class CustomOAuth2User implements OAuth2User {
    private OAuth2User oauth2User;
     
    public CustomOAuth2User(OAuth2User oauth2User) {
        this.oauth2User = oauth2User;
    }
 
    @Override
    public Map<String, Object> getAttributes() {
        return oauth2User.getAttributes();
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return oauth2User.getAuthorities();
    }
 
    @Override
    public String getName() {
        String name = oauth2User.getAttribute("name");

        // For Github a "name" is not required so this attribute might be null.
        // In such a case, just fallback to the default getName() function which
        // will work but returns the numeric "id" for the account which
        // isn't pretty but at least it will work.
        if (name == null) {
            name = oauth2User.getName();
        }
        return name;
    }

}