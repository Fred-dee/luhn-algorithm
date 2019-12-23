package fred.dilapisho;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class Validate {
	public static boolean validate(String n) {
		checkArgument(!checkNotNull(n).isEmpty());
		int offset;
		final AtomicInteger index = new AtomicInteger();
		final List<Integer> integerArrayList = new ArrayList<>();
		if (isEven(n)) {
			offset = 0;
		} else {
			offset = 1;
		}
		Stream.of(n.trim()).forEach(num -> {
					if (isEven(index.get() + offset)) {
						integerArrayList.add(multiplyAndCalculate(num));
					} else {
						integerArrayList.add(Integer.parseInt(num));
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

	private static int multiplyAndCalculate(final String num) {
		final int converted = Integer.parseInt(num);
		int calculated = converted * 2;
		if (calculated > 9) {
			return (calculated - 9);
		} else {
			return calculated;
		}
	}

}
