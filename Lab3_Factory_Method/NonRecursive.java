package client;

public class NonRecursive extends SortFactory {
    public SortingAlgorithm getAlgorithm(){
        if (algorithm.equals("Selection"))
            return new SelectionSort();
        else
            return new InsertionSort();
    }
}
