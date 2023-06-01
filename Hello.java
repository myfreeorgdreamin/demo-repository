class Hello {
  String dummy(){
      return null;
  }

  String foo(int i){
      String s = "Hello";
      if (i > 0){
          s = dummy();
      }
      return s
  }

  int bar(int j){
      String greeting = foo(j);
      // int length = greeting != null ? greeting.length() : 0;
      int length = greeting.length();
      return length;
  }
}
