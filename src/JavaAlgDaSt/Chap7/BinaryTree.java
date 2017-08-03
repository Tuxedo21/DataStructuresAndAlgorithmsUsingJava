package JavaAlgDaSt.Chap7;

import JavaAlgDaSt.Chap4.Listing2;
import com.sun.deploy.panel.TreeRenderers;
import sun.reflect.generics.tree.Tree;

/**
 * Created by tuxedo21 on 26/02/17.
 */
public class BinaryTree {
    TreeNode root;

    public BinaryTree(){
        root = null;
    }

  private boolean findNode(String targetKey, TreeNodeWrapper parent, TreeNodeWrapper child){
      parent.set(root);
      child.set(root);

      if (root == null)
          return false;
      else {
          while (child.get() != null){
              if(child.get().node.compareTo(targetKey) == 0)
                  return true;
              else {
                  parent.set(child.get());
                  if(targetKey.compareTo(child.get().node.getKey()) < 0)
                      child.set(child.get().lc);
                  else
                      child.set(child.get().rc);

              }
          }return false;
      }
  }

    public void LNRtraversal(TreeNode node){

        if(node.lc != null)
            LNRtraversal(node.lc);
        System.out.println(node.node.toString());
        if(node.rc != null)
            LNRtraversal(node.rc);

    }


    public boolean insert(Listing2 newListing){
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        TreeNode n = new TreeNode();
        if(n == null)//out of memory
            return false;
        else{
            n.node = newListing.deepCopy();
            n.lc = null;
            n.rc = null;
            if(root == null)
                root = n;
            else {
                findNode(newListing.getKey(),p,c);//this changes our p an c. You don't need them to be returned since they are being changed ;)
                if(newListing.getKey().compareTo(p.get().node.getKey()) < 0)
                    p.get().lc = n;
                else
                    p.get().rc = n;

            }
            return true;
        }
    }

    public Listing2 fetch(String targetKey){
        boolean found;
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        found = findNode(targetKey,p,c);
        if (found){
            return c.get().node.deepCopy();
        }else
            return null;

    }

    public boolean delete(String targetKey){
        boolean found;
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        found = findNode(targetKey,p,c);
        if(!found)
            return false;
        else {
            if(c.get().rc == null && c.get().lc == null){//CASE 1
                if(p.get().lc == c.get()){
                    p.get().lc = null;
                    return true;
                }else {
                    p.get().rc = null;
                    return true;
                }
            }//END OF CASE 1
            else if(c.get().rc == null && c.get().lc != null || c.get().lc == null && c.get().rc != null){//CASE 2
                if(p.get().lc == c.get()){
                    if(c.get().lc != null){
                        p.get().lc = c.get().lc;
                        return true;
                    }else {
                        p.get().lc = c.get().rc;
                        return true;
                    }
                }
                else { //right chiled
                    if (c.get().lc != null){
                        p.get().rc = c.get().lc;
                        return true;
                    }else {
                        p.get().rc = c.get().rc;
                        return true;
                    }

                }
            }//END OF CASE 2
            else{
                TreeNode nextLargest = c.get().lc;
                TreeNode largest = nextLargest.rc;
                if(largest != null) { //left child has a right subtree
                    while (largest.rc != null) {
                        nextLargest = largest;
                        largest = largest.rc;
                    }
                    c.get().node = largest.node;
                    nextLargest.rc = largest.lc;
                }else {
                    nextLargest.rc = c.get().rc;
                    if(p.get().lc == c.get()){
                        p.get().lc = nextLargest;
                    }else
                        p.get().rc = nextLargest;
                }

            }
        }return true;
    }

    public boolean update(String targetKey, Listing2 newListing){
        if(delete(targetKey) == false)
            return false;
        else if(insert(newListing) == false)
            return false;
        return true;
    }





    public class TreeNodeWrapper{
        TreeNode treeRef = null;
        public TreeNodeWrapper(){

        }
        public TreeNode get(){
            return treeRef;
        }
        public void set(TreeNode t){
            this.treeRef = t;
        }


    }
}
