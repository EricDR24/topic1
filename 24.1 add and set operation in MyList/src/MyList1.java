
		public interface MyList1<E> extends java.lang.Iterable<E> {
			//add to the list
			public void add(E e);

	
			public void add(int index, E e);

			//clear list
			public void clear();

			//return true
			public boolean contains(E e);

			public E get(int index);

			public int indexOf(E e);

			//true if nothing contain
			public boolean isEmpty();

			
			public int lastIndexOf(E e);

			//remove from list and return true and move left
			public boolean remove(E e);
			
			
			public E remove(int index);

			
			public Object set(int index, E e);

			
			public int size();

			
			public boolean addAll(MyList1<E> otherList);

			
			public boolean removeAll(MyList1<E> otherList);

			
			public boolean retainAll(MyList1<E> otherList);
		}
