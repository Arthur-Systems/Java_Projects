package ch13;
//package ch13;

//demo: use of Generics

 class GeneItems<T1, T2 , T3> {
		private T1 firstObj;
		private T2 secondObj;
		private T3 thirdObj;

		public GeneItems(T1 Obj1, T2 Obj2, T3 Obj3) {
			firstObj = Obj1;
			secondObj = Obj2;
			thirdObj = Obj3;
		}
		public void setFirstObj(T1 Obj1) {
			firstObj = Obj1;
		}
		public T1 getFirstObj() {
			return firstObj;
		}
		public void setSecondObj(T2 Obj2) {
			secondObj = Obj2;
		}
			public T2 getSecondObj() {
					return secondObj;
		}

		public void setThirdObj(T3 Obj3) {
			thirdObj = Obj3;
		}
		public T3 getThirdObj() {
			return thirdObj;
		}
}
