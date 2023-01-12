
package com.sistema.examenes.controladores;

import com.sistema.examenes.entidades.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userduqueza")
public class UserController {

        @CrossOrigin(origins={"http://localhost:4200", "https://frontendnov.web.app"})	
        @PostMapping("/")
	public User login(@RequestBody User useri) {   
                String username=useri.getUser();
                String pwd=useri.getPwd();
                //String username ="SebasEdit";
                if ("SebasEdit".equals(username) && "1234".equals(pwd)) {
                String token = getJWTToken(username);
		User user = new User();
		user.setUser(username);
		user.setToken(token);		
		return user;} else
                {                                     
                String token = "";
		User user = new User();
		user.setUser(username);
		user.setToken(token);		
		return user; }                     
                
		

		
	}

	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		/*List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");*/
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				/*.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))*/
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		/*String token="EdicionModeAutorizado";*/
                
                return "Bearer " + token;
	}
}