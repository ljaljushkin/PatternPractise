package swing.simple_listener;

// Someone interested in "Hello" events

class Responder implements HelloListener {

    @Override
    public void someoneSaidHello() {
        System.out.println("Hello there...: " + this.getClass().getSimpleName());
    }
}