/*
 * Copyright 2015 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.utils

import org.apache.spark.{SparkConf, SparkContext}

/**
 * Created by spark on 2/24/15.
 */
object SparkContextProvider {



  lazy val sparkContext = {
    val conf = new SparkConf()
    conf.setMaster("local[*]")
    conf.setAppName("Tests")
   val sc= new SparkContext(conf)
    sc
  }
}
