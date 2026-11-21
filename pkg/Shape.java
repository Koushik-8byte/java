package pkg;

/**
 * Common contract for all shapes.
 * <p>
 * An interface only declares <i>what</i> a shape can do; each class that
 * implements it decides <i>how</i> to do it. This is the basis of
 * polymorphism: one reference type ({@code Shape}) can hold many
 * different objects.
 */
// Must be PUBLIC, otherwise classes outside package "pkg" cannot import it.
public interface Shape {

    /**
     * Calculates the area of the shape and prints it to the console.
     */
    // Interface methods are implicitly public and abstract.
    void area();
}