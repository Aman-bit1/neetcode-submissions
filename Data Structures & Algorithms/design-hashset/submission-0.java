class MyHashSet {

    public MyHashSet() {
        
    }
    ArrayList<Integer>ans=new ArrayList<>();
    
    public void add(int key) {
        for(Integer it:ans){
            if(it==key) return;
        }
        ans.add(key);
    }
    
    public void remove(int key) {
      
      ans.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        for(Integer it:ans){
            if(it==key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */