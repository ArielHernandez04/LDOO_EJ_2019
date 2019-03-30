public final class Usuario {
    
    private String user;
    private String email;
    private String password;
    private String date;
    
    public Usuario(String user, String email, String password, String date){
        setUser(user);
        setEmail(email);
        setPassword(password);
        setDate(date);
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public String getUser(){
        return user;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getDate(){
        return date;
    }
}
