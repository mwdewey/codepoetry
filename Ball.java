class Ball extends Throwable{
    void HowTo() throws Ball{
        try {
            throw new Ball();
        }
        catch (Ball ball){
            throw ball;
        }
    }
}