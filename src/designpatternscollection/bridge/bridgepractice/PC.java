package designpatternscollection.bridge.bridgepractice;

public class PC extends Computer
{
    public PC(OperatingSystem logic)
    {
        super(logic);
    }
    @Override
    public void startup()
    {
        os.startup();
    }
    @Override
    public void browseInternet(String url)
    {
        os.loadUrl(url);
    }
    @Override
    public boolean canMoveComputer()
    {
        return false;
    }
}