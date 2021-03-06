package net.sansa_stack.inference.utils

/**
  * Some utility methods for Scala collections.
  *
  * @author Lorenz Buehmann
  */
object CollectionUtils {

  /**
    * Converts a list of tuples into a multimap having as key the first element of each tuple.
    *
    * @param tuples the tuples
    * @return the multimap
    */
  def toMultiMap[A, B](tuples: Iterable[(A, B)]): Map[A, Set[B]] = {
    tuples.groupBy(e => e._1).mapValues(e => e.map(x => x._2).toSet).map(identity)
  }

}
