package login;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveData{
	
	public static boolean saveData(Object data, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			 oos.writeObject(data);
			 oos.close();
			 fos.close();
			 return true;
			 
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}
	public static Object loadData(String path) {
		Object data = null;
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			data = ois.readObject();
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
