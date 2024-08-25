package com.hospitalacceso.utils.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Calendar;

public class JWTUtils {

    public static String generateToken(String correo) {

        Algorithm algorithm = Algorithm.HMAC256("SECRET_KEY");

        //Add one hour
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.HOUR,  1);

        String token = JWT.create()
                .withSubject("Blackslate")
                .withIssuer("Blackslate")
                .withClaim("user", correo)
                .withExpiresAt(cal.getTime())
                .sign(algorithm);

        System.out.println(token);

        return token;
    }

}
