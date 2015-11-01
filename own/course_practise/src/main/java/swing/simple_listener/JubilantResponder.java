package swing.simple_listener;

// Someone interested in "Hello" events

class JubilantResponder implements HelloListener {

    @Override
    public void someoneSaidHello() {
        System.out.println("Someone said hello!! HOORAY!!!!!: " + this.getClass().getSimpleName());
    }
}