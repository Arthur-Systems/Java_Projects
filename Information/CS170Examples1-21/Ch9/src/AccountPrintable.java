//An interface

import java.text.*;
import java.util.*;

public interface AccountPrintable{
	void print();
	NumberFormat currencyFormat(Locale locale);
}
