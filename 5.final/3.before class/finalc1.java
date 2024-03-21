// A FINAL CLASS CAN'T BE A PARENT CLASS, MEANS NO CLASS CAN INHERIT FROM IT

final class A
{

}

class B extends A //  error: cannot inherit from final A
{

} 