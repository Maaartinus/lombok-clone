final class EqualsAndHashCodeWithPrecomputed {
	String s1;
	String s2;

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsAndHashCodeWithPrecomputed)) return false;
		final EqualsAndHashCodeWithPrecomputed other = (EqualsAndHashCodeWithPrecomputed)o;
		final java.lang.Object this$s1 = this.s1;
		final java.lang.Object other$s1 = other.s1;
		if (this$s1 == null ? other$s1 != null : !this$s1.equals(other$s1)) return false;
		final java.lang.Object this$s2 = this.s2;
		final java.lang.Object other$s2 = other.s2;
		if (this$s2 == null ? other$s2 != null : !this$s2.equals(other$s2)) return false;
		return true;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $s1 = this.s1;
		result = result * PRIME + ($s1 == null ? 0 : $s1.hashCode());
		final java.lang.Object $s2 = this.s2;
		result = result * PRIME + ($s2 == null ? 0 : $s2.hashCode());
		return result;
	}

	@java.beans.ConstructorProperties({"s1", "s2"})
	@java.lang.SuppressWarnings("all")
	public EqualsAndHashCodeWithPrecomputed(final String s1, final String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
}
