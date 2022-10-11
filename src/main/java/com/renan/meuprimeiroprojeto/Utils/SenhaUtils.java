package com.renan.meuprimeiroprojeto.Utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

    /*
     * Gera um hash usando o BCrypt
     * @param senha
     * @return String
     * 
     */

    public static String gerarBCrypt(String senha){
        if(senha == null){
            return senha;
        }

        BCryptPasswordEncoder bEncoder = new BCryptPasswordEncoder();
        return bEncoder.encode(senha);
    }

    /*
     * Verifica se a senha é válida.
     * 
     * @param senha
     * @param senhaEncoded
     * @return boolean
     */

     public static boolean senhaValida(String senha, String senhaEncoded){
        BCryptPasswordEncoder bEncoder = new BCryptPasswordEncoder();
        return bEncoder.matches(senha, senhaEncoded);
     }
    
}
