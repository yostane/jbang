package dev.jbang.source.sources;

import java.util.function.Function;

import javax.annotation.Nonnull;

import dev.jbang.source.*;

public class JshSource extends JavaSource {
	public JshSource(ResourceRef script, Function<String, String> replaceProperties) {
		super(script, replaceProperties);
	}

	protected JshSource(ResourceRef ref, String script, Function<String, String> replaceProperties) {
		super(ref, script, replaceProperties);
	}

	@Override
	public @Nonnull Type getType() {
		return Type.jshell;
	}

	@Override
	public Builder<CmdGeneratorBuilder> getBuilder(BuildContext ctx) {
		return () -> CmdGenerator.builder(ctx);
	}
}
