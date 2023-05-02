Where the equals method is useful?

- internally by collections : set, map

Set - do not allow duplicates - calls equals() - element position - hashCode()

we do not have get() method in Set- retrieve element on index

hashCode() method - based on hash function

hashCode() is a method of Object class

# HashSet data arrangement

1. Bucket arrangement are based on hash values (0...15)
   ArrayListList
2. Within buckets, object (s) are arranged as LinkedList

# Set Implementations

1. HashSet
2. TreeSet
3. LinkedHashSet
