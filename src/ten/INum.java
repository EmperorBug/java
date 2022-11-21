package ten;

import java.util.Objects;

public class INum {
    int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        return (this.num == ((INum)o).num) ? true:false;
    }
}
