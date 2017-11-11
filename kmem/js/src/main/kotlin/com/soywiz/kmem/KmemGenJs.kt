// @WARNING: File AUTOGENERATED by `kmem/jvm/src/test/kotlin/Generator.kt` do not modify manually!
@file:Suppress("NOTHING_TO_INLINE", "EXTENSION_SHADOWED_BY_MEMBER", "RedundantUnitReturnType", "FunctionName", "UnsafeCastFromDynamic")
package com.soywiz.kmem

import org.khronos.webgl.*

actual typealias MemBuffer = ArrayBuffer
actual inline fun MemBufferAlloc(size: Int): MemBuffer = ArrayBuffer((size + 0xF) and 0xF.inv())
actual inline fun MemBufferWrap(array: ByteArray): MemBuffer = array.unsafeCast<Int8Array>().buffer
actual inline val MemBuffer.size: Int get() = this.byteLength

actual inline fun MemBuffer._sliceInt8Buffer(offset: Int, size: Int): Int8Buffer = Int8Array(this, offset * 1, size)
actual inline fun MemBuffer._sliceInt16Buffer(offset: Int, size: Int): Int16Buffer = Int16Array(this, offset * 2, size)
actual inline fun MemBuffer._sliceInt32Buffer(offset: Int, size: Int): Int32Buffer = Int32Array(this, offset * 4, size)
actual inline fun MemBuffer._sliceFloat32Buffer(offset: Int, size: Int): Float32Buffer = Float32Array(this, offset * 4, size)
actual inline fun MemBuffer._sliceFloat64Buffer(offset: Int, size: Int): Float64Buffer = Float64Array(this, offset * 8, size)

actual typealias DataBuffer = DataView
actual fun MemBuffer.getData(): DataBuffer = DataView(this)
actual fun DataBuffer.getByte(index: Int): Byte = this.getInt8(index)
actual fun DataBuffer.setByte(index: Int, value: Byte): Unit = run { this.setInt8(index, value) }
actual fun DataBuffer.getShort(index: Int): Short = this.getInt16(index, true)
actual fun DataBuffer.setShort(index: Int, value: Short): Unit = run { this.setInt16(index, value, true) }
actual fun DataBuffer.getInt(index: Int): Int = this.getInt32(index, true)
actual fun DataBuffer.setInt(index: Int, value: Int): Unit = run { this.setInt32(index, value, true) }
actual fun DataBuffer.getFloat(index: Int): Float = this.getFloat32(index, true)
actual fun DataBuffer.setFloat(index: Int, value: Float): Unit = run { this.setFloat32(index, value, true) }
actual fun DataBuffer.getDouble(index: Int): Double = this.getFloat64(index, true)
actual fun DataBuffer.setDouble(index: Int, value: Double): Unit = run { this.setFloat64(index, value, true) }

actual typealias Int8Buffer = Int8Array
actual inline val Int8Buffer.mem: MemBuffer get() = this.buffer
actual inline val Int8Buffer.offset: Int get() = this.byteOffset / 1
actual inline val Int8Buffer.size: Int get() = this.asDynamic().length
actual inline operator fun Int8Buffer.get(index: Int): Byte = this.asDynamic()[index]
actual inline operator fun Int8Buffer.set(index: Int, value: Byte): Unit = run { this.asDynamic()[index] = value }

actual typealias Int16Buffer = Int16Array
actual inline val Int16Buffer.mem: MemBuffer get() = this.buffer
actual inline val Int16Buffer.offset: Int get() = this.byteOffset / 2
actual inline val Int16Buffer.size: Int get() = this.asDynamic().length
actual inline operator fun Int16Buffer.get(index: Int): Short = this.asDynamic()[index]
actual inline operator fun Int16Buffer.set(index: Int, value: Short): Unit = run { this.asDynamic()[index] = value }

actual typealias Int32Buffer = Int32Array
actual inline val Int32Buffer.mem: MemBuffer get() = this.buffer
actual inline val Int32Buffer.offset: Int get() = this.byteOffset / 4
actual inline val Int32Buffer.size: Int get() = this.asDynamic().length
actual inline operator fun Int32Buffer.get(index: Int): Int = this.asDynamic()[index]
actual inline operator fun Int32Buffer.set(index: Int, value: Int): Unit = run { this.asDynamic()[index] = value }

actual typealias Float32Buffer = Float32Array
actual inline val Float32Buffer.mem: MemBuffer get() = this.buffer
actual inline val Float32Buffer.offset: Int get() = this.byteOffset / 4
actual inline val Float32Buffer.size: Int get() = this.asDynamic().length
actual inline operator fun Float32Buffer.get(index: Int): Float = this.asDynamic()[index]
actual inline operator fun Float32Buffer.set(index: Int, value: Float): Unit = run { this.asDynamic()[index] = value }

actual typealias Float64Buffer = Float64Array
actual inline val Float64Buffer.mem: MemBuffer get() = this.buffer
actual inline val Float64Buffer.offset: Int get() = this.byteOffset / 8
actual inline val Float64Buffer.size: Int get() = this.asDynamic().length
actual inline operator fun Float64Buffer.get(index: Int): Double = this.asDynamic()[index]
actual inline operator fun Float64Buffer.set(index: Int, value: Double): Unit = run { this.asDynamic()[index] = value }

inline fun ByteArray.asInt8Array(): Int8Array = this.unsafeCast<Int8Array>()
inline fun ByteArray.asTyped(): Int8Array = this.unsafeCast<Int8Array>()
inline fun ShortArray.asInt16Array(): Int16Array = this.unsafeCast<Int16Array>()
inline fun ShortArray.asTyped(): Int16Array = this.unsafeCast<Int16Array>()
inline fun IntArray.asInt32Array(): Int32Array = this.unsafeCast<Int32Array>()
inline fun IntArray.asTyped(): Int32Array = this.unsafeCast<Int32Array>()
inline fun FloatArray.asFloat32Array(): Float32Array = this.unsafeCast<Float32Array>()
inline fun FloatArray.asTyped(): Float32Array = this.unsafeCast<Float32Array>()
inline fun DoubleArray.asFloat64Array(): Float64Array = this.unsafeCast<Float64Array>()
inline fun DoubleArray.asTyped(): Float64Array = this.unsafeCast<Float64Array>()

actual fun <T> arraycopy(src: Array<T>, srcPos: Int, dst: Array<T>, dstPos: Int, size: Int): Unit {
	if ((src === dst) && (srcPos >= dstPos)) {
		for (n in 0 until size) dst[dstPos + n] = src[srcPos + n]
	} else {
		for (n in size - 1 downTo 0) dst[dstPos + n] = src[srcPos + n]
	}
}
actual fun  arraycopy(src: BooleanArray, srcPos: Int, dst: BooleanArray, dstPos: Int, size: Int): Unit {
	if ((src === dst) && (srcPos >= dstPos)) {
		for (n in 0 until size) dst[dstPos + n] = src[srcPos + n]
	} else {
		for (n in size - 1 downTo 0) dst[dstPos + n] = src[srcPos + n]
	}
}
actual fun  arraycopy(src: LongArray, srcPos: Int, dst: LongArray, dstPos: Int, size: Int): Unit {
	if ((src === dst) && (srcPos >= dstPos)) {
		for (n in 0 until size) dst[dstPos + n] = src[srcPos + n]
	} else {
		for (n in size - 1 downTo 0) dst[dstPos + n] = src[srcPos + n]
	}
}
actual fun arraycopy(src: ByteArray, srcPos: Int, dst: ByteArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: ShortArray, srcPos: Int, dst: ShortArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: IntArray, srcPos: Int, dst: IntArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: FloatArray, srcPos: Int, dst: FloatArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: DoubleArray, srcPos: Int, dst: DoubleArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)

actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = Int8Array(dst, dstPos).set(Int8Array(src, srcPos, size), 0)
actual fun arraycopy(src: ByteArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = Int8Array(dst).set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: ByteArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(dst.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: ShortArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = Int16Array(dst).set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: ShortArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(dst.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: IntArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = Int32Array(dst).set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: IntArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(dst.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: FloatArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = Float32Array(dst).set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: FloatArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(dst.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: DoubleArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = Float64Array(dst).set(src.asTyped().subarray(srcPos, srcPos + size), dstPos)
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: DoubleArray, dstPos: Int, size: Int): Unit = dst.asTyped().set(dst.asTyped().subarray(srcPos, srcPos + size), dstPos)

@PublishedApi actual internal fun <T> _fill(array: Array<T>, value: T, pos: Int, size: Int): Unit = run { for (n in 0 until size) array[pos + n] = value }
@PublishedApi actual inline internal fun _fill(array: ByteArray, value: Byte, pos: Int, size: Int): Unit = run { array.asDynamic().fill(value, pos, pos + size) }
@PublishedApi actual inline internal fun _fill(array: ShortArray, value: Short, pos: Int, size: Int): Unit = run { array.asDynamic().fill(value, pos, pos + size) }
@PublishedApi actual inline internal fun _fill(array: IntArray, value: Int, pos: Int, size: Int): Unit = run { array.asDynamic().fill(value, pos, pos + size) }
@PublishedApi actual inline internal fun _fill(array: FloatArray, value: Float, pos: Int, size: Int): Unit = run { array.asDynamic().fill(value, pos, pos + size) }
@PublishedApi actual inline internal fun _fill(array: DoubleArray, value: Double, pos: Int, size: Int): Unit = run { array.asDynamic().fill(value, pos, pos + size) }
