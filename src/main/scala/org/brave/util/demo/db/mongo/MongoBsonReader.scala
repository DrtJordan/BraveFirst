package org.brave.util.demo.db.mongo

import org.apache.hadoop.conf.Configuration
import org.apache.spark.{SparkConf, SparkContext}

/**
 * Created by yuchen
 * on 2016-07-12.
 */
object MongoBsonReader {

  def main(args: Array[String]) {

    val conf = new SparkConf()
    conf.setMaster("local[6]")
    conf.setAppName("sparksql---1")
    conf.set("spark.executor.memory", "6g")
    val sc = new SparkContext(conf)
    val config = new Configuration()
//    config.set("mongo.input.uri", "mongodb://121.199.180.177:30001/apiTest.goodsKeyWords6222")
    config.set("mongo.input.uri", "mongodb://192.168.60.88:27017/tsq.data_tag_filter")
    //config.set("mongo.output.uri", "mongodb://192.168.60.88:27017/sparktest.output")
//    val mongoRDD = sc.newAPIHadoopRDD(config, classOf[com.mongodb.hadoop.MongoInputFormat], classOf[Object], classOf[BSONObject])
//
   // mongoRDD.foreach(println)
    // Input contains tuples of (ObjectId, BSONObject)
//    val countsRDD = mongoRDD.flatMap(arg => {
//      var str = arg._2.get("tag").toString
//      str = str.toLowerCase().replaceAll("[.,!?\n]", " ")
//      str.split(" ")
//    })
//    .map(word => (word, 1))
//    .reduceByKey((a, b) => a + b)

    // Output contains tuples of (null, BSONObject) - ObjectId will be generated by Mongo driver if null
//    val saveRDD = countsRDD.map((tuple) => {
//      var bson = new BasicBSONObject()
//      bson.put("name", tuple)
//     // bson.put("count", tuple)
//      (null, bson)
//    })

    // Only MongoOutputFormat and config are relevant
    //saveRDD.saveAsNewAPIHadoopFile("file:///bogus", classOf[Any], classOf[Any], classOf[com.mongodb.hadoop.MongoOutputFormat[Any, Any]], config)
  }
}
