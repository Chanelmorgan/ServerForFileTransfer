public class MyFile {

    // Class variables
    private int id; 
    private String name; 
    private byte[] data;
    private String fileExtension;

    
    // Constructor
    public MyFile(int id, String name, byte[] data, String fileExtension){
        this.id = id;
        this.name = name;
        this.data = data;
        this.fileExtension = fileExtension;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public byte[] getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public String getFileExtension() {
        return fileExtension;
    }



}
