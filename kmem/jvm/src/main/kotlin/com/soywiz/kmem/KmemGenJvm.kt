// @WARNING: File AUTOGENERATED by `kmem/jvm/src/test/kotlin/Generator.kt` do not modify manually!
// @TODO: USELESS_CAST is required since it requires a cast to work, but IDE says that that cast is not necessary
@file:Suppress("NOTHING_TO_INLINE", "EXTENSION_SHADOWED_BY_MEMBER", "RedundantUnitReturnType", "FunctionName", "USELESS_CAST")
package com.soywiz.kmem

import java.nio.*
import java.util.*

fun ByteBuffer.slice(offset: Int, size: Int): ByteBuffer = run { val out = this.duplicate(); out.position(this.position() + offset); out.limit(out.position() + size); return out }
fun ShortBuffer.slice(offset: Int, size: Int): ShortBuffer = run { val out = this.duplicate(); out.position(this.position() + offset); out.limit(out.position() + size); return out }
fun IntBuffer.slice(offset: Int, size: Int): IntBuffer = run { val out = this.duplicate(); out.position(this.position() + offset); out.limit(out.position() + size); return out }
fun FloatBuffer.slice(offset: Int, size: Int): FloatBuffer = run { val out = this.duplicate(); out.position(this.position() + offset); out.limit(out.position() + size); return out }
fun DoubleBuffer.slice(offset: Int, size: Int): DoubleBuffer = run { val out = this.duplicate(); out.position(this.position() + offset); out.limit(out.position() + size); return out }
actual class MemBuffer(val buffer: ByteBuffer, val size: Int)
actual fun MemBufferAlloc(size: Int): MemBuffer = MemBuffer(ByteBuffer.allocate((size + 0xF) and 0xF.inv()).order(ByteOrder.nativeOrder()), size)
actual fun MemBufferWrap(array: ByteArray): MemBuffer = MemBuffer(ByteBuffer.wrap(array).order(ByteOrder.nativeOrder()), array.size)
actual inline val MemBuffer.size: Int get() = this.size

actual fun MemBuffer._sliceInt8Buffer(offset: Int, size: Int): Int8Buffer = Int8Buffer(this, this.buffer.slice(offset, size))
actual fun MemBuffer._sliceInt16Buffer(offset: Int, size: Int): Int16Buffer = Int16Buffer(this, this.buffer.asShortBuffer().slice(offset, size))
actual fun MemBuffer._sliceInt32Buffer(offset: Int, size: Int): Int32Buffer = Int32Buffer(this, this.buffer.asIntBuffer().slice(offset, size))
actual fun MemBuffer._sliceFloat32Buffer(offset: Int, size: Int): Float32Buffer = Float32Buffer(this, this.buffer.asFloatBuffer().slice(offset, size))
actual fun MemBuffer._sliceFloat64Buffer(offset: Int, size: Int): Float64Buffer = Float64Buffer(this, this.buffer.asDoubleBuffer().slice(offset, size))

actual typealias DataBuffer = MemBuffer
actual fun MemBuffer.getData(): DataBuffer = this
actual fun DataBuffer.getByte(index: Int): Byte = buffer.get(index)
actual fun DataBuffer.setByte(index: Int, value: Byte): Unit = run { buffer.put(index, value) }
actual fun DataBuffer.getShort(index: Int): Short = buffer.getShort(index)
actual fun DataBuffer.setShort(index: Int, value: Short): Unit = run { buffer.putShort(index, value) }
actual fun DataBuffer.getInt(index: Int): Int = buffer.getInt(index)
actual fun DataBuffer.setInt(index: Int, value: Int): Unit = run { buffer.putInt(index, value) }
actual fun DataBuffer.getFloat(index: Int): Float = buffer.getFloat(index)
actual fun DataBuffer.setFloat(index: Int, value: Float): Unit = run { buffer.putFloat(index, value) }
actual fun DataBuffer.getDouble(index: Int): Double = buffer.getDouble(index)
actual fun DataBuffer.setDouble(index: Int, value: Double): Unit = run { buffer.putDouble(index, value) }

actual class Int8Buffer(val mbuffer: MemBuffer, val jbuffer: ByteBuffer)
actual val Int8Buffer.mem: MemBuffer get() = mbuffer
actual val Int8Buffer.offset: Int get() = jbuffer.position()
actual val Int8Buffer.size: Int get() = jbuffer.limit()
actual operator fun Int8Buffer.get(index: Int): Byte = jbuffer.get(offset + index)
actual operator fun Int8Buffer.set(index: Int, value: Byte): Unit = run { jbuffer.put(offset + index, value) }

actual class Int16Buffer(val mbuffer: MemBuffer, val jbuffer: ShortBuffer)
actual val Int16Buffer.mem: MemBuffer get() = mbuffer
actual val Int16Buffer.offset: Int get() = jbuffer.position()
actual val Int16Buffer.size: Int get() = jbuffer.limit()
actual operator fun Int16Buffer.get(index: Int): Short = jbuffer.get(offset + index)
actual operator fun Int16Buffer.set(index: Int, value: Short): Unit = run { jbuffer.put(offset + index, value) }

actual class Int32Buffer(val mbuffer: MemBuffer, val jbuffer: IntBuffer)
actual val Int32Buffer.mem: MemBuffer get() = mbuffer
actual val Int32Buffer.offset: Int get() = jbuffer.position()
actual val Int32Buffer.size: Int get() = jbuffer.limit()
actual operator fun Int32Buffer.get(index: Int): Int = jbuffer.get(offset + index)
actual operator fun Int32Buffer.set(index: Int, value: Int): Unit = run { jbuffer.put(offset + index, value) }

actual class Float32Buffer(val mbuffer: MemBuffer, val jbuffer: FloatBuffer)
actual val Float32Buffer.mem: MemBuffer get() = mbuffer
actual val Float32Buffer.offset: Int get() = jbuffer.position()
actual val Float32Buffer.size: Int get() = jbuffer.limit()
actual operator fun Float32Buffer.get(index: Int): Float = jbuffer.get(offset + index)
actual operator fun Float32Buffer.set(index: Int, value: Float): Unit = run { jbuffer.put(offset + index, value) }

actual class Float64Buffer(val mbuffer: MemBuffer, val jbuffer: DoubleBuffer)
actual val Float64Buffer.mem: MemBuffer get() = mbuffer
actual val Float64Buffer.offset: Int get() = jbuffer.position()
actual val Float64Buffer.size: Int get() = jbuffer.limit()
actual operator fun Float64Buffer.get(index: Int): Double = jbuffer.get(offset + index)
actual operator fun Float64Buffer.set(index: Int, value: Double): Unit = run { jbuffer.put(offset + index, value) }

actual fun <T> arraycopy(src: Array<T>, srcPos: Int, dst: Array<T>, dstPos: Int, size: Int): Unit = System.arraycopy(src, srcPos, dst, dstPos, size)
actual fun  arraycopy(src: BooleanArray, srcPos: Int, dst: BooleanArray, dstPos: Int, size: Int): Unit = System.arraycopy(src, srcPos, dst, dstPos, size)
actual fun  arraycopy(src: LongArray, srcPos: Int, dst: LongArray, dstPos: Int, size: Int): Unit = System.arraycopy(src, srcPos, dst, dstPos, size)
actual fun arraycopy(src: ByteArray, srcPos: Int, dst: ByteArray, dstPos: Int, size: Int): Unit = System.arraycopy(src, srcPos, dst, dstPos, size)
actual fun arraycopy(src: ShortArray, srcPos: Int, dst: ShortArray, dstPos: Int, size: Int): Unit = System.arraycopy(src, srcPos, dst, dstPos, size)
actual fun arraycopy(src: IntArray, srcPos: Int, dst: IntArray, dstPos: Int, size: Int): Unit = System.arraycopy(src, srcPos, dst, dstPos, size)
actual fun arraycopy(src: FloatArray, srcPos: Int, dst: FloatArray, dstPos: Int, size: Int): Unit = System.arraycopy(src, srcPos, dst, dstPos, size)
actual fun arraycopy(src: DoubleArray, srcPos: Int, dst: DoubleArray, dstPos: Int, size: Int): Unit = System.arraycopy(src, srcPos, dst, dstPos, size)

actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = run { dst.buffer.slice(dstPos, size).put(src.buffer.slice(srcPos, size)) }
actual fun arraycopy(src: ByteArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = run { (dst.sliceInt8Buffer(dstPos, size) as Int8Buffer).jbuffer.put(src, srcPos, size) }
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: ByteArray, dstPos: Int, size: Int): Unit = run { (src.sliceInt8Buffer(srcPos, size) as Int8Buffer).jbuffer.get(dst, dstPos, size) }
actual fun arraycopy(src: ShortArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = run { (dst.sliceInt16Buffer(dstPos, size) as Int16Buffer).jbuffer.put(src, srcPos, size) }
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: ShortArray, dstPos: Int, size: Int): Unit = run { (src.sliceInt16Buffer(srcPos, size) as Int16Buffer).jbuffer.get(dst, dstPos, size) }
actual fun arraycopy(src: IntArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = run { (dst.sliceInt32Buffer(dstPos, size) as Int32Buffer).jbuffer.put(src, srcPos, size) }
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: IntArray, dstPos: Int, size: Int): Unit = run { (src.sliceInt32Buffer(srcPos, size) as Int32Buffer).jbuffer.get(dst, dstPos, size) }
actual fun arraycopy(src: FloatArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = run { (dst.sliceFloat32Buffer(dstPos, size) as Float32Buffer).jbuffer.put(src, srcPos, size) }
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: FloatArray, dstPos: Int, size: Int): Unit = run { (src.sliceFloat32Buffer(srcPos, size) as Float32Buffer).jbuffer.get(dst, dstPos, size) }
actual fun arraycopy(src: DoubleArray, srcPos: Int, dst: MemBuffer, dstPos: Int, size: Int): Unit = run { (dst.sliceFloat64Buffer(dstPos, size) as Float64Buffer).jbuffer.put(src, srcPos, size) }
actual fun arraycopy(src: MemBuffer, srcPos: Int, dst: DoubleArray, dstPos: Int, size: Int): Unit = run { (src.sliceFloat64Buffer(srcPos, size) as Float64Buffer).jbuffer.get(dst, dstPos, size) }

@PublishedApi actual internal fun <T> _fill(array: Array<T>, value: T, start: Int, end: Int): Unit = Arrays.fill(array, start, end, value)
@PublishedApi actual internal fun  _fill(array: BooleanArray, value: Boolean, start: Int, end: Int): Unit = Arrays.fill(array, start, end, value)
@PublishedApi actual internal fun  _fill(array: LongArray, value: Long, start: Int, end: Int): Unit = Arrays.fill(array, start, end, value)
@PublishedApi actual internal fun _fill(array: ByteArray, value: Byte, start: Int, end: Int): Unit = Arrays.fill(array, start, end, value)
@PublishedApi actual internal fun _fill(array: ShortArray, value: Short, start: Int, end: Int): Unit = Arrays.fill(array, start, end, value)
@PublishedApi actual internal fun _fill(array: IntArray, value: Int, start: Int, end: Int): Unit = Arrays.fill(array, start, end, value)
@PublishedApi actual internal fun _fill(array: FloatArray, value: Float, start: Int, end: Int): Unit = Arrays.fill(array, start, end, value)
@PublishedApi actual internal fun _fill(array: DoubleArray, value: Double, start: Int, end: Int): Unit = Arrays.fill(array, start, end, value)
