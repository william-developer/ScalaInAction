package com.bigdata.scala.dataset

import scala.collection.immutable.{TreeMap, TreeSet}
import scala.collection.mutable
/**
 * Created by wangfei on 15-8-17.
 */
object Set_Map {
  def main(args: Array[String]) {
    val data= mutable.Set.empty[Int]
    data ++= List(1,2,3,4)
    data +=5
    data --=List(1,2)
    println(data)
    data+=3
    println(data)
    data.clear
    println(data)

    val map = mutable.Map.empty[String,String]
    map("java")="Hadoop"
    map("scala")="scala"
    println(map)

    val treeSet =TreeSet(9,2,3,4,5,6,8,1)
    println(treeSet)

    val treeMap= TreeMap("scala"->"spark","java"->"hadoop")
    println(treeMap)



  }
}
