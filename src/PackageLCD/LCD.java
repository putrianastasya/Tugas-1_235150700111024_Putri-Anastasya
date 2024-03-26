package PackageLCD;

public class LCD {
    
    LCD (){
        this.status = "Off";
        this.volume = 0;
        this.brightness = 0;
        this.cable = "VGA";


    }

    private String status;
    private int volume; 
    private int brightness;
    private String cable;

    
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume = " + this.volume);
    }
    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Kecerahan = " + this.brightness);
    }
    public void setCable(String cable) {
        switch (cable) {
            case "HDMI":
                this.cable = "HDMI";
                break;
            case "VGA":
                this.cable = "VGA";
                break;
            case "DVI":
                this.cable = "DVI";
                break;
            case "DisplayPort":
                this.cable = "DisplayPort.";
                break;
        
            default:
                break;
        }
        this.cable = cable;
        System.out.println(this.cable + " terpasang");
    }


    public void turnOff() {
        this.status = "Off";
    }

    public void turnOn() {
        this.status = "On";
    }

    public void freeze() {
        this.status = "Freeze";
    }
   
    public void volumeUp() {
        volume++;
        System.out.println("Volume = " + this.volume);
    }
    
    public void volumeDown() {
        volume--;
        System.out.println("Volume = " + this.volume);
    }
  
    public void brightnessUp() {
        brightness++;
        System.out.println("Kecerahan = " + this.brightness);
    }

    public void brightnessDown() {
        brightness--;
        System.out.println("Kecerahan = " + this.brightness);
    }


    public void display (){
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
    }
    
   

    

    


    

    
}
