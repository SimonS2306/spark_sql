package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.io.Serializable;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.sql.AnalysisException;
import static org.apache.spark.sql.functions.col;

public class SparkSQL {

  public static void main(String[] args) {
    // $example on:init_session$
    SparkSession spark = SparkSession
      .builder()
      .appName("Java Spark SQL basic example")
      .config("spark.some.config.option", "some-value")
      .getOrCreate();

  }

  private static void runBasicDataFrameExample(SparkSession spark) {
    // $example on:create_df$
    Dataset<Row> df = spark.read().json("examples/src/main/resources/people.json");

    // Displays the content of the DataFrame to stdout
    df.show();
    // +----+-------+
    // | age|   name|
    // +----+-------+
    // |null|Michael|
    // |  30|   Andy|
    // |  19| Justin|
    // +----+-------+
    // $example off:create_df$
  }
}
