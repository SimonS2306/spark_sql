package testing;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SparkSQL {

  public static void main(String[] args) {
	  
	System.setProperty("hadoop.home.dir", "C:\\Users\\Simon\\Documents\\winutils\\");
	
    SparkSession spark = SparkSession
      .builder()
      .master("local[2]")
      .appName("SQLSpark")
      .config("spark.some.config.option", "some-value")
      .getOrCreate();
    
    runBasicDataFrameExample(spark);

  }

  private static void runBasicDataFrameExample(SparkSession spark) {

    Dataset<Row> df = spark.read().json("F:\\Coding\\spark-2.3.1-bin-hadoop2.7\\examples\\src\\main\\resources\\people.json\\");
    df.show();
  }
}
