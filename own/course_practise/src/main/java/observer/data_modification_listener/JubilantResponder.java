package observer.data_modification_listener;

// Someone interested in "Hello" events

class JubilantResponder implements HelloListener {

    @Override
    public void someoneSaidHello() {
        System.out.println(this.getClass().getSimpleName() + "----> Someone said hello!! HOORAY!!!!!");
    }
}