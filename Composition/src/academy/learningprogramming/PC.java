package academy.learningprogramming;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard mortherboard;

    public PC(Case theCase, Monitor monitor, Motherboard mortherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.mortherboard = mortherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }
}
