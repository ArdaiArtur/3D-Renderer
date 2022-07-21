#Information
Tutorial link
http://blog.rogach.org/2015/08/how-to-create-your-own-simple-3d-render.html?m=1
Explanation:
Any rotation in 3D space can be expressed as combination of 3 primitive rotations: rotation in XY plane, rotation in YZ plane and rotation in XZ plane. We can write out transformation matrices for each of those rotations as follows:
XY rotation matrix:

[cos0 -sin0 0]
[sin0  cos0 0]
[0     0    1]
 
YZ rotation matrix:

[1    0     0]
[0  cos0 sin0]
[0 -sin0 cos0]
 
XZ rotation matrix:

[cos0 0 -sin0]
[0    1     0]
[sin0 0  cos0]
Here comes the magic: if you need to first rotate a point in XY plane using transformation matrix  T1 , and then rotate it in YZ plane using transfromation matrix  T2 , you can simply multiply  T1  with  T2  and get a single matrix to describe the whole rotation:

(AT1)T2=A(T1T2)
 
This is a very useful optimization - instead of recomputing multiple rotations on each point, you precompute the matrix once and then use it in your pipeline.
