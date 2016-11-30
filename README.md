# Sem-I
[![Build Status](https://ci.aksw.org/jenkins/job/SANSA%20Inference%20Layer/job/develop/badge/icon)](https://ci.aksw.org/jenkins/job/SANSA%20Inference%20Layer/job/develop/)

## Structure
### inference-common
* common datastructures
* rule dependency analysis 

### inference-spark
Contains the core Inference API based on Apache Spark.

### inference-flink
Contains the core Inference API based on Apache Flink.

### inference-tests
Contains common test classes and data.

## Usage
```
Usage: RDFGraphMaterializer [options]


  -i <file> | --input <file>
        the input file in N-Triple format
  -o <directory> | --out <directory>
        the output directory
  -p {rdfs | owl-horst | owl-el | owl-rl} | --profile {rdfs | owl-horst | owl-el | owl-rl}
        the reasoning profile
  --help
        prints this usage text
```
