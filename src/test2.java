import org.gdal.gdal.Dataset;
import org.gdal.gdal.gdal;
import org.gdal.*;

public class test2 {

public static void main(String[] args){

	String[] cmd = {"-t_srs", "CRS:84", "-f", "GeoJSON","C:\\pruebas\\MANZANA.geojson","C:\\pruebas\\MANZANA.shp"};
	ogr2ogr.main(cmd);
	System.out.println("Test2 DONE");

	}

}