package kodlama.io.hrms.core.utils.security.jwt.abstracts;

public interface TokenService {

    public String generateToken(String userName);


    public boolean tokenValidate(String token);

    public String getUserFromToken(String token);
}