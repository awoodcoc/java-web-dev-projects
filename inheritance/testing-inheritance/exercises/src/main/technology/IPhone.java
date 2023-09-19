public class IPhone extends  Computer {

    private String version;

    public IPhone (String aVersion, String type, double serialNum) {
        super (type, serialNum);
        version = aVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
