import api.ApiSource;
import api.ApiUser;
import model.source.RootSource;
import model.source.RootSourceSingle;
import model.user.Root;
import model.user.Root2;
import org.testng.annotations.Test;

public class FirstTest {
    ApiUser apiUser = new ApiUser();
    ApiSource apiSource = new ApiSource();

    @Test
    public void ft(){
        Root root = new Root();
        root = apiUser.getUser(2);
        System.out.println(root.toString());
    }
    @Test
    public void st(){
        Root2 root = new Root2();
        root     = apiUser.getUser();
        System.out.println(root.toString());
    }
    @Test
    public void tt(){
        Root root = new Root();
        root = apiUser.getUser404();
        System.out.println(root.toString());
    }
    @Test
    public void fourT(){
        RootSource root = new RootSource();
        root = apiSource.getSource();
        System.out.println(root.toString());
    }
    @Test
    public void fiveT(){
        RootSourceSingle root = new RootSourceSingle();
        root = apiSource.getSourceSingle();
        System.out.println(root.toString());
    }
    @Test
    public void sixT(){
        RootSource root = new RootSource();
        root = apiSource.getSource404();
        System.out.println(root.toString());
    }
}
