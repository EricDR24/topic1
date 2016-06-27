
		public abstract class MyAbstractList1<E> implements MyList1<E> {
			protected int size = 0;

			//create list
			protected MyAbstractList1() {
			}

			//create list from arrarys
			protected MyAbstractList1(E[] objects) {
				for (int i = 0; i < objects.length; i++)
					add(objects[i]);
			}

			@Override //add to the list
			public void add(E e) {
				add(size, e);
			}

			@Override
			public boolean isEmpty() {
				return size == 0;
			}

			@Override /** Return the number of elements in this list */
			public int size() {
				return size;
			}

			@Override 
			public boolean remove(E e) {
				if (indexOf(e) >= 0) {
					remove(indexOf(e));
					return true;
				}
				else
					return false;
			}

			@Override //add to the lists
			public boolean addAll(MyList1<E> otherList) {
				boolean changed = false;
				for (int i = 0; i < otherList.size(); i++) {
					E e = otherList.get(i);
					if (!contains(e)){
						add(e);
						changed = true;
					}
				}
				return changed;
			}

			@Override //removes all from lists
			public boolean removeAll(MyList1<E> otherList) {
				boolean changed = false;
				for (int i = 0; i < otherList.size(); i++) {
					E e = otherList.get(i); 
					if (contains(e)) {
						remove(e);
						changed = true;
					}
				}
				return changed;
			}

			@Override //retains lists
			public boolean retainAll(MyList1<E> otherList) {
				boolean changed = false;
				for (int i = size - 1; i >= 0; i--) {
					E e = get(i);
					if (!otherList.contains(e)) {
						remove(i);
						changed = true;
					}
				}
				return changed;
			}
		}