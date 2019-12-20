package banking7;
@SuppressWarnings("all")
public class OverdraftException extends  RuntimeException{
    private static final long serialVersionUID = 1L;
    private double deficit;//用于显示不足金额数目

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit(){
        return deficit;
    }
}
