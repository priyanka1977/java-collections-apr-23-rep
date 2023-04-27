Array in Java can store primitive data as well as Objects

Collection framework
A Collection is a group of Objects
Heterogenous objects - Any type of Object (A single collection: String, Person, Employee..)

==============================================================================
Java 1.5 = GENERICS makes collection specific, inform the compiler to do type-safety check
<T> - placeholder , developer will define what is the Type for <T>.

List - default behavior of list is mutability (modify the elements)

     How to make a list immutable (once element added in the list, it cannot be modified)

=============================================================================
ClassCastException - that can occur when you try to improperly convert a class from one type to another ..It is an unchecked exception.

===============================================================================
All collections should be measured on performance based on operation performed on collection.

# Operation on collections:

1.  add // add the element at the end
2.  remove // delete the element
3.  get // retrieve
4.  contains // search an element
5.  set // replace an element

In ArrayList, whenever add(index, element) - internally ArrayList will create a temporary list in which all elements are re-arranged

add(index, element) - a cost to the arrayList

# In LinkedList - add(index, element) will be easily linked with other nodes
