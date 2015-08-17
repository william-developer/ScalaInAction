package com.bigdata.scala.dataset

import scala.collection.immutable.Queue
import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
 * Created by wangfei on 15-8-17.
 */
object ListBuffer_ListArray {
  def main(args: Array[String]) {
    val listBuffer = new ListBuffer[Int]()
    listBuffer+=1
    listBuffer+=2
    println(listBuffer)

    val arrayBuffer = new ArrayBuffer[Int]()
    arrayBuffer+=1
    arrayBuffer+=3
    println(arrayBuffer)

    val empty= Queue[Int]()
    val queue1=empty.enqueue(1)
    val queue2=queue1.enqueue(List(1, 2, 3, 4))
    println(queue2)
    val (elem,left) =queue2.dequeue
    println(elem+"   "+left)

    import scala.collection.mutable.Queue
    val queue=Queue[String]()
    queue+="a"
    queue++=List("b","c","d")
    println(queue)
    println(queue.dequeue())
    println(queue)


    import scala.collection.mutable.Stack
    val stack  = new Stack[Int]
    stack.push(1)
    stack.push(3)
    stack.push(4)
    println(stack)
    println(stack.top)
    println(stack)
    println(stack.pop)
    println(stack)
  }
}
