package fred.dilapisho;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class Validate {

	private static final int charOffset = 48;
	public static boolean validate(String n) {
		checkArgument(!checkNotNull(n).isEmpty());

		int offset = (isEven(n)) ? 0 : 1;
		final AtomicInteger index = new AtomicInteger(0);
		final List<Integer> integerArrayList = new ArrayList<>();
		n.chars().forEachOrdered(
				num -> {
					if (isEven(index.get() + offset)) {
						integerArrayList.add(multiplyAndCalculate(num));
					} else {
						integerArrayList.add(num - charOffset);
					}

					index.getAndIncrement();
				}
		);
		final int sum = integerArrayList.stream().mapToInt(a -> a).sum();
		return (sum % 10 == 0);
	}

	private static boolean isEven(final String n) {
		return (n.length() % 2 == 0);
	}

	private static boolean isEven(final int n) {
		return (n % 2 == 0);
	}

	private static int multiplyAndCalculate(final int num) {

		int calculated = (num - charOffset) * 2;
		if (calculated > 9) {
			return (calculated - 9);
		} else {
			return calculated;
		}
	}

}
