package testing;

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.SparkConf;

import java.util.Arrays;


public class Earthquake {
	
	SparkConf conf = new SparkConf().setAppName("earthquake").setMaster("local");
	JavaSparkContext sc = new JavaSparkContext(conf);
	
	java.util.List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
	JavaRDD<Integer> distData = sc.parallelize(data);
	

}




