// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

final class CodeAssembler64GenWTests extends CodeAssemblerTestsBase {
	CodeAssembler64GenWTests() {
		super(64);
	}

	@Test
	void wait_() {
		testAssembler(c -> c.wait_(), Instruction.create(Code.WAIT));
	}

	@Test
	void wbinvd() {
		testAssembler(c -> c.wbinvd(), Instruction.create(Code.WBINVD));
	}

	@Test
	void wbnoinvd() {
		testAssembler(c -> c.wbnoinvd(), Instruction.create(Code.WBNOINVD));
	}

	@Test
	void wrfsbase_r32() {
		testAssembler(c -> c.wrfsbase(edx), Instruction.create(Code.WRFSBASE_R32, ICRegisters.edx));
	}

	@Test
	void wrfsbase_r64() {
		testAssembler(c -> c.wrfsbase(rdx), Instruction.create(Code.WRFSBASE_R64, ICRegisters.rdx));
	}

	@Test
	void wrgsbase_r32() {
		testAssembler(c -> c.wrgsbase(edx), Instruction.create(Code.WRGSBASE_R32, ICRegisters.edx));
	}

	@Test
	void wrgsbase_r64() {
		testAssembler(c -> c.wrgsbase(rdx), Instruction.create(Code.WRGSBASE_R64, ICRegisters.rdx));
	}

	@Test
	void wrmsr() {
		testAssembler(c -> c.wrmsr(), Instruction.create(Code.WRMSR));
	}

	@Test
	void wrmsrlist() {
		testAssembler(c -> c.wrmsrlist(), Instruction.create(Code.WRMSRLIST));
	}

	@Test
	void wrmsrns() {
		testAssembler(c -> c.wrmsrns(), Instruction.create(Code.WRMSRNS));
	}

	@Test
	void wrpkru() {
		testAssembler(c -> c.wrpkru(), Instruction.create(Code.WRPKRU));
	}

	@Test
	void wrssd_m_r32() {
		testAssembler(c -> c.wrssd(mem_ptr(0x0L).base(rcx), ebx), Instruction.create(Code.WRSSD_M32_R32, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void wrssq_m_r64() {
		testAssembler(c -> c.wrssq(mem_ptr(0x0L).base(rcx), rbx), Instruction.create(Code.WRSSQ_M64_R64, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.rbx));
	}

	@Test
	void wrudbg() {
		testAssembler(c -> c.wrudbg(), Instruction.create(Code.WRUDBG), TestInstrFlags.NONE, com.github.icedland.iced.x86.dec.DecoderOptions.UDBG);
	}

	@Test
	void wrussd_m_r32() {
		testAssembler(c -> c.wrussd(mem_ptr(0x0L).base(rcx), ebx), Instruction.create(Code.WRUSSD_M32_R32, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void wrussq_m_r64() {
		testAssembler(c -> c.wrussq(mem_ptr(0x0L).base(rcx), rbx), Instruction.create(Code.WRUSSQ_M64_R64, new MemoryOperand(ICRegisters.rcx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.rbx));
	}

}
