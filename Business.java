import java.util.*;
import java.io.*;

public class Business {

    private ArrayList<DataEntry> dataBase;

    //iniatizes list containing immigrants
    public Business(){
        dataBase = new ArrayList<DataEntry>();
    }

    public void add_DB(DataEntry immigrant) {
        dataBase.add(immigrant);
    }

    public DataEntry retrieve_DB(int index) {
        return dataBase.get(index);
    }

    //get the size of the table
    public int getSize()
    {
        return dataBase.size();
    }

    //get the table
    public ArrayList<DataEntry> getTable()
    {
        return dataBase;
    }
    
}
