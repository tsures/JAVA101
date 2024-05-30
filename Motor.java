public class Motor {

    private double Volt = 0;

    public static enum MotorType {
        ANDY_MARK, BANE_BOTS, CIM, VEX
    }

    public static enum MotorDirection {
        Right,Left,Other
    }

    public static enum MovingDirection {Forward,None,Revrese}
    public double Speed =0;
    public MovingDirection MovingToDir;
    public MotorType motorCompany;
    public MotorDirection Direction;

    public String MovingTo (){
        return MovingToDir+" "+Speed; 
    }    

    public Motor(double volt, MotorType mt,MotorDirection direction) {
        motorCompany = mt;
        Direction= direction;
        Volt = volt;
    }

    public double getMotorVolt() {
        return Volt;
    }

    public void Go (MovingDirection dir,int Speed)
    {
        MovingToDir = dir;
        this.Speed= Speed;
    }

    public String GetDirASpeed()
    {
        return this.Direction+" "+this.Speed;
    }

    private void Go (MovingDirection dir,double Speed)  
    {
        // Set direction
      if (dir == MovingDirection.Forward) {
    // Code to set motor to forward direction
       } else if (dir == MovingDirection.Revrese) {  
    // Code to set motor to reverse direction
  }

  // Set speed 
  // Code to set motor speed to the passed in speed value
  
  // Start motor
  // Code to start motor running
    }
}
