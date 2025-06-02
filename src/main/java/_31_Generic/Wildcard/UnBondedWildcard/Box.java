package _31_Generic.Wildcard.UnBondedWildcard;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Box<T> {
    private T item;

}
