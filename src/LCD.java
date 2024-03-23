public class LCD {
    // deklarasi variabel dengan modifier private
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    // default constructor
    public LCD(){}

    // method turnOff untuk mengganti nilai status menjadi Off
    public void turnOff(){
        status = "Off";
    }

    // method turnOn untuk mengganti nilai status menjadi On
    public void turnOn(){
        status = "On";
    }

    // method Freeze untuk mengganti nilai status menjadi Freeze
    public void Freeze(){
        status = "Freeze";
    }

    // method volumeUp untuk menambah nilai volume menggunakan increment
    public void volumeUp(){
        volume++;
    }

    // method volumeDown untuk mengurangi nilai volume menggunakan decrement
    public void volumeDown(){
        volume--;
    }

    // method setVolume untuk menginisialisasi variabel volume, mengambil nilai dari parameter vol
    public void setVolume(int vol){
        volume = vol;
    }

    // method brightnessUp untuk menambah nilai brightness menggunakan increment
    public void brightnessUp(){
        brightness++;
    }

    // method brightnessDown untuk mengurangi nilai brightness menggunakan decrement
    public void brightnessDown(){
        brightness--;
    }

    // method setBrightness untuk menginisialisasi variabel brightness, mengambil nilai dari parameter bright
    public void setBrightness(int bright){
        brightness = bright;
    }
    
    // method setCable untuk menginisialisasi variabel cable, dengan melakukan seleksi menggunakan switch case yang berdasarkan nilai option yang diambil dari parameter method
    public void setCable(int option) {
        switch (option) {
            case 1:
                cable = "VGA";
                break;
            case 2:
                cable = "HDMI";
                break;
            case 3:
                cable = "DVI";
                break;
            default:
                break;
        }
    }
    
    // menampilkan pesan mengenai spesifikasi LCD meliputi status, volume, brightness, dan cable
    public void displayMessage() {
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + cable);
    }
     
}